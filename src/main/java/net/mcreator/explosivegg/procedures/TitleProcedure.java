package net.mcreator.explosivegg.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.explosivegg.network.ExplosiveggModVariables;

import java.util.Iterator;

public class TitleProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				ExplosiveggModVariables.MapVariables.get(world).FTimeSec = ExplosiveggModVariables.MapVariables.get(world).FTimeSec + 1;
				ExplosiveggModVariables.MapVariables.get(world).syncData(world);
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						ExplosiveggModVariables.MapVariables.get(world).FTimeSec = ExplosiveggModVariables.MapVariables.get(world).FTimeSec + 1;
						ExplosiveggModVariables.MapVariables.get(world).syncData(world);
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private LevelAccessor world;

							public void start(LevelAccessor world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								ExplosiveggModVariables.MapVariables.get(world).FTimeSec = ExplosiveggModVariables.MapVariables.get(world).FTimeSec
										+ 1;
								ExplosiveggModVariables.MapVariables.get(world).syncData(world);
								new Object() {
									private int ticks = 0;
									private float waitTicks;
									private LevelAccessor world;

									public void start(LevelAccessor world, int waitTicks) {
										this.waitTicks = waitTicks;
										MinecraftForge.EVENT_BUS.register(this);
										this.world = world;
									}

									@SubscribeEvent
									public void tick(TickEvent.ServerTickEvent event) {
										if (event.phase == TickEvent.Phase.END) {
											this.ticks += 1;
											if (this.ticks >= this.waitTicks)
												run();
										}
									}

									private void run() {
										ExplosiveggModVariables.MapVariables
												.get(world).FTimeSec = ExplosiveggModVariables.MapVariables.get(world).FTimeSec + 1;
										ExplosiveggModVariables.MapVariables.get(world).syncData(world);
										new Object() {
											private int ticks = 0;
											private float waitTicks;
											private LevelAccessor world;

											public void start(LevelAccessor world, int waitTicks) {
												this.waitTicks = waitTicks;
												MinecraftForge.EVENT_BUS.register(this);
												this.world = world;
											}

											@SubscribeEvent
											public void tick(TickEvent.ServerTickEvent event) {
												if (event.phase == TickEvent.Phase.END) {
													this.ticks += 1;
													if (this.ticks >= this.waitTicks)
														run();
												}
											}

											private void run() {
												ExplosiveggModVariables.MapVariables
														.get(world).FTimeSec = ExplosiveggModVariables.MapVariables.get(world).FTimeSec + 1;
												ExplosiveggModVariables.MapVariables.get(world).syncData(world);
												new Object() {
													private int ticks = 0;
													private float waitTicks;
													private LevelAccessor world;

													public void start(LevelAccessor world, int waitTicks) {
														this.waitTicks = waitTicks;
														MinecraftForge.EVENT_BUS.register(this);
														this.world = world;
													}

													@SubscribeEvent
													public void tick(TickEvent.ServerTickEvent event) {
														if (event.phase == TickEvent.Phase.END) {
															this.ticks += 1;
															if (this.ticks >= this.waitTicks)
																run();
														}
													}

													private void run() {
														ExplosiveggModVariables.MapVariables
																.get(world).FTimeSec = ExplosiveggModVariables.MapVariables.get(world).FTimeSec + 1;
														ExplosiveggModVariables.MapVariables.get(world).syncData(world);
														ExplosiveggModVariables.MapVariables.get(world).Time = false;
														ExplosiveggModVariables.MapVariables.get(world).syncData(world);
														if ((entity.getCapability(ExplosiveggModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																.orElse(new ExplosiveggModVariables.PlayerVariables())).FireUse == 1) {
															if (entity instanceof ServerPlayer _player) {
																Advancement _adv = _player.server.getAdvancements()
																		.getAdvancement(new ResourceLocation("explosivegg:lightning_1"));
																AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
																if (!_ap.isDone()) {
																	Iterator _iterator = _ap.getRemainingCriteria().iterator();
																	while (_iterator.hasNext())
																		_player.getAdvancements().award(_adv, (String) _iterator.next());
																}
															}
															ExplosiveggModVariables.MapVariables.get(world).Lightning = true;
															ExplosiveggModVariables.MapVariables.get(world).syncData(world);
															if (entity instanceof Player _player && !_player.level.isClientSide())
																_player.displayClientMessage(
																		new TextComponent("Use the lightning 80 times to get the next ability!"),
																		(true));
															ExplosiveggModVariables.MapVariables.get(world).prog = 0;
															ExplosiveggModVariables.MapVariables.get(world).syncData(world);
														}
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, 20);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, 20);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, 20);
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, 20);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 20);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 20);
	}
}
